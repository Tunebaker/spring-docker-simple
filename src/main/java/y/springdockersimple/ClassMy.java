package y.springdockersimple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ClassMy {
    public static void main(String[] args) {
        int[] mas = {5, 2, 1, 9, 8, 5, 6, 3, 2, 6, 1, 9, 8, 7};

        for (int ma : mas) {
            
        }
        Arrays.stream(mas)
                .boxed()
                .collect(Collectors.toList());

        IntStream.of(mas).boxed()
                .collect(Collectors.toList());

        List<Integer> list = new ArrayList<>();
        // 5 -> true
 
 
        //
        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < mas.length; i++) {
            if (res.containsKey(mas[i])) {
                res.put(mas[i], res.get(mas[i]) + 1);
            } else {
                res.put(mas[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }

 


        res.forEach((k, v) -> {
            if (v == 1) {
                System.out.println(k);
            }
        });
    }
}
