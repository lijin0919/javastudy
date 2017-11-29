package 使用DOM4J解析XML文件;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
public class Dom4j {
    public static Document doc;

    public static void main(String[] args) {
        loadDocument();
//		showPhoneInfo();
//		saveXML("src/新收藏.xml");
//		addNewPhoneInfo();
//		updatePhoneInfo();
        deleteItem();
        showPhoneInfo();
    }

    public static void loadDocument(){
        try{
            SAXReader saxReader = new SAXReader();
            doc = saxReader.read(new File("src/收藏信息.xml"));
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public static void updatePhoneInfo(){
        // 获取XML的根节点
        Element root = doc.getRootElement();
        int id = 0;
        for (Iterator itBrand = root.elementIterator(); itBrand.hasNext();) {
            Element brand = (Element) itBrand.next();
            id++;
            brand.addAttribute("id", id + "");
        }

        saveXML("src/收藏信息.xml");

    }

    public static void deleteItem(){
        // 获取XML的根节点
        Element root = doc.getRootElement();
        int id = 0;
        for (Iterator itBrand = root.elementIterator(); itBrand.hasNext();) {
            Element brand = (Element) itBrand.next();
            if (brand.attributeValue("name").equals("华为")) {
                brand.getParent().remove(brand);
            }
        }
//		saveXML("src/收藏信息.xml");
    }

    public static void showPhoneInfo() {
        // 获取XML的根节点
        Element root = doc.getRootElement();
        // 遍历所有的Brand标签
        for (Iterator itBrand = root.elementIterator(); itBrand.hasNext();) {
            Element brand = (Element) itBrand.next();
            // 输出标签的name属性
            System.out.println("品牌：" + brand.attributeValue("name"));
            // 遍历Type标签
            for (Iterator itType = brand.elementIterator(); itType.hasNext();) {
                Element type = (Element) itType.next();
                // 输出标签的name属性
                System.out.println("\t型号：" + type.attributeValue("name"));
            }
        }

    }

    public static void saveXML(String path){
        try {
            OutputFormat format = OutputFormat.createPrettyPrint();
            format.setEncoding("GBK"); // 指定XML编码
            XMLWriter writer;
            writer = new XMLWriter(new FileWriter(path), format);
            writer.write(doc);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void addNewPhoneInfo(){
        // 获取XML的根节点
        Element root = doc.getRootElement();
        // 创建Brand标签
        Element el = root.addElement("Brand");
        // 给Brand标签设置属性
        el.addAttribute("name", "三星");
        // 创建Type标签
        Element typeEl = el.addElement("Type");
        // 给Type标签设置属性
        typeEl.addAttribute("name", "Note4");
        saveXML("src/收藏信息.xml");
    }
}
