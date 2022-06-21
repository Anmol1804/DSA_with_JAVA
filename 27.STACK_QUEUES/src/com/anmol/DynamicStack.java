package com.anmol;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        // it will call CustomStack()
        super();
    }

    public DynamicStack(int size){
        // it will call CustomStack(size)
        super(size);
    }

    // everything is same as custom
    // but only we want to change is push

    @Override
    public boolean push(int item){
        if (this.isFull()){
            // double size
            int[] temp = new int[data.length * 2];
            
            // copy al prev in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        // insert item
        return super.push(item);
    }
}
