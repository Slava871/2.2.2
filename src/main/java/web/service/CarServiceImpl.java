package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private List<Car> listCar;

    {
        listCar = new ArrayList<>();
        listCar.add(new Car(122, "grey", 220));
        listCar.add(new Car(137, "red", 250));
        listCar.add(new Car(149, "white", 170));
        listCar.add(new Car(151, "metallic", 240));
        listCar.add(new Car(161, "черный", 290));
    }

    public List<Car> getAllCars(){
        return listCar;
    }

    public List<Car> getSomeCars(int count){
        List<Car> list2 = new ArrayList<>();
        if(count >= 2 && count < 5) {
            for (int j = 0; j < count; j++) {
                list2.add(listCar.get(j));
            }
            return list2;
        }else if(count >= 5){
            for (int j = 0; j < 5; j++) {
                list2.add(listCar.get(j));
            }
            return list2;
        } else if(count < 2){
            System.out.println("please, enter correct parameter count ");
            return null;
        }
        return list2;
    }

}
