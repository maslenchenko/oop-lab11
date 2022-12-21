package org.example;

import java.util.List;

public class ProxyImage implements MyImage{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        else {
            realImage.display();
        }
    }
}
