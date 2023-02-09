import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Услуги: ");
        ArrayList serv = new ArrayList();
        // serv.add("0");
        serv.add("Техническое обслуживание, стоимость: 1500 руб");
        serv.add("Диагностика автомобиля, стоимость: 1000 руб");
        serv.add("Ремонт подвески / ходовой, стоимость: 400 руб");
        serv.add("Обслуживание тормозной системы, стоимость: 750 руб");
        serv.add("Ремонт двигателя автомобиля, стоимость: 10000 руб");
        serv.add("Шиномонтаж и хранение колес, стоимость: 1500 руб");
        serv.add("Ремонт топливной системы, стоимость: 2000 руб");
        serv.add("Ремонт системы охлаждения, стоимость: 2000 руб");
        serv.add("Ремонт выхлопной системы, стоимость: 1300 руб");
        serv.add("Обслуживание и ремонт автомобиля, стоимость: 30000 руб");

        for (Object s : serv) {
            System.out.println(s);
        }

        StrScanner strScanner = new StrScanner();
        strScanner.str();
    }
}