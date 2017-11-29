package 使用DOM4J解析XML文件;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {

    public static Document doc;

    public static void main(String[] args) {
        deleteItem();
    }

    public static void updatePhoneInfo(){
        try {
            // 1、得到DOM解析器的工厂实例
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            // 2、从DOM工厂获得DOM解析器
            DocumentBuilder db = dbf.newDocumentBuilder();
            // 3、解析XML文档，得到一个Document，即DOM树
            doc = db.parse("src/收藏信息.xml");

            NodeList list = doc.getElementsByTagName("Brand");
            for(int i = 0; i < list.getLength(); i++){
                Element el = (Element) list.item(i);
                el.setAttribute("id", i+"");
            }

            saveXML("src/收藏信息.xml");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void deleteItem(){
        try {
            // 1、得到DOM解析器的工厂实例
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            // 2、从DOM工厂获得DOM解析器
            DocumentBuilder db = dbf.newDocumentBuilder();
            // 3、解析XML文档，得到一个Document，即DOM树
            doc = db.parse("src/收藏信息.xml");

            NodeList list = doc.getElementsByTagName("Brand");
            for(int i = 0; i < list.getLength(); i++){
                Element el = (Element) list.item(i);
                if(el.getAttribute("name").equals("华为")){
                    el.getParentNode().removeChild(el);
                }
            }

            saveXML("src/收藏信息.xml");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void showPhoneInfo(){
        try {
            // 1、得到DOM解析器的工厂实例
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            // 2、从DOM工厂获得DOM解析器
            DocumentBuilder db = dbf.newDocumentBuilder();
            // 3、解析XML文档，得到一个Document，即DOM树
            doc = db.parse("src/收藏信息.xml");

            //获取所有Brand标签
            NodeList brandList = doc.getElementsByTagName("Brand");
            //遍历所有的Brand标签
            for(int i = 0 ; i < brandList.getLength(); i++){
                Node brand = brandList.item(i);
                //判断节点类型是否是Element
                if(brand.getNodeType() != 1){
                    continue;
                }
                //输出标签的name属性
                Element el = (Element)brand;
                System.out.println("品牌：" + el.getAttribute("name"));

                //获取Brand标签的所有子节点
                NodeList typeList = el.getChildNodes();
                //遍历Brand标签
                for(int j = 0; j < typeList.getLength(); j++){
                    Node type = typeList.item(j);
                    if(type.getNodeType() != 1){
                        continue;
                    }
                    el = (Element)type;
                    System.out.println("\t型号：" + el.getAttribute("name"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveXML(String path){
        try {
            //获得TransformerFactory对象
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(doc);
            // 设置编码类型
            transformer.setOutputProperty(OutputKeys.ENCODING, "gb2312");
            StreamResult result = new StreamResult(new FileOutputStream(path));
            // 把DOM树转换为XML文件
            transformer.transform(domSource, result);
        } catch (TransformerConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void addNewPhoneInfo(){
        try {
            // 1、得到DOM解析器的工厂实例
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            // 2、从DOM工厂获得DOM解析器
            DocumentBuilder db;

            db = dbf.newDocumentBuilder();

            // 3、解析XML文档，得到一个Document，即DOM树
            doc = db.parse("src/收藏信息.xml");

            //创建Brand标签
            Element el = doc.createElement("Brand");
            //给Brand标签设置属性
            el.setAttribute("name", "三星");
            //创建Type标签
            Element typeEl = doc.createElement("Type");
            //给Type标签设置属性
            typeEl.setAttribute("name", "Note4");
            //将Type标签
            el.appendChild(typeEl);
            doc.getElementsByTagName("PhoneInfo").item(0).appendChild(el);
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

