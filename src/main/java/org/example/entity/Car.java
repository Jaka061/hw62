package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "model",nullable = false)
    private String model;
    @Column(name = "car_num" , nullable = false,unique = true)
    private String carNum;

    public Car(){}
    public Car(String model, String carNum) {
        this.model = model;
        this.carNum = carNum;
    }

    public Integer getId() { return id;
    }
    public void setId(Integer id) { this.id = id;
    }
    public String getModel() { return model;
    }
    public void setModel(String model) { this.model = model;
    }
    public String getCarNum() { return carNum;
    }
    public void setCarNum(String carNum) { this.carNum = carNum;
    }
}
