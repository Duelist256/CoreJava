package day170821;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "hello";

        Supplier<LocalDate> dataSupplier1 = new Supplier<LocalDate>() {
            @Override
            public LocalDate get() {
                return LocalDate.now();
            }
        };

        Supplier<LocalDate> dataSupplier2 = () -> LocalDate.now();

        Supplier<LocalDate> dataSupplier3 = LocalDate::now; // ссылка на метод, которая конвертируется в
//      лямбда выражение

        LocalDate localData = dataSupplier1.get();
        System.out.println(localData);

        Supplier<ArrayList<String>> arrayListSupplier1 = () -> new ArrayList<>();
        Supplier<ArrayList<String>> arrayListSupplier2 = ArrayList::new;
    }
}
