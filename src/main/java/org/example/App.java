package org.example;

import org.example.db.CarDb;
import org.example.entity.Car;
import java.util.List;
import java.util.stream.Stream;

public class App
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        for (int i = 0; i <10 ; i++) {
            Car car = new Car("model"+i,"AC4"+i+"6"+i+"B");
            CarDb.create(car);
        }
////Update
//        Car  car = new Car();
//        car.setId(5);
//        car.setModel("model5");
//        car.setCarNum("AC4465B");
//        CarDb.update(car);
////Get All
//        CarDb.getAll().stream().forEach(x -> System.out.println(x));
//// Delete by id
//        CarDb.deleteById(5);

    }
}
