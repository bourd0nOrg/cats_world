package com.alex.eat;

public class CabbageBasketArray implements Weigh {
    private Cabbage[] cabbages;
    private int index;
    private int size;

    public CabbageBasketArray(int size) {
        this.cabbages = new Cabbage[size];
        this.size = size;
        this.index = -1;
    }

    public void addCabbage(Cabbage cabbage) {
        if (index < size - 1) {
            index = index + 1;
            this.cabbages[index] = cabbage;
        } else {
            System.out.println("Sorry basket is full");
        }
    }

    public Cabbage getCabbage() {
        if (index >= 0) {
            Cabbage cabbage = cabbages[index];
            index = index - 1;
            return cabbage;
        } else {
            throw new IllegalStateException("Sorry, no cabbage in basket");
        }
    }

    public Cabbage[] getCabbages() {
        return cabbages;
    }

    public int getCurrentSize() {
        return index + 1;
    }

    @Override
    public int getWeight() {
        int sum = 0;
       /* for (int i = 0; i < cabbages.length; i++) {
            Cabbage currentCabbage = cabbages[i];
            if (currentCabbage i = null){
                sum = sum + cabbages[i].getWeight();
            }
        }*/
        //2 variant
        for (int i = 0; i < getCurrentSize(); i++) {
            sum = sum + cabbages[i].getWeight();
        }
        return sum;
    }
}
        //3 variant
      /*  for (Cabbage currentCabbage : cabbages) {
            if (cabbage i=null) {
                sum = sum cabbages.getWeight();
            }
        }
            return 0;
        }
    }*/

