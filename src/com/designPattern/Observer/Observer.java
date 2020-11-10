package com.designPattern.Observer;

//观察者接口
 interface  Observer {
     void update(String Data);

     void disObservered(TheSubject subject);

     void doObservered(TheSubject subject);
}
