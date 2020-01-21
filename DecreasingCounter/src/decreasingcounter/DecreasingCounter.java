/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decreasingcounter;

/**
 *
 * @author thejcode24
 */
public class DecreasingCounter {

    /**
     * @param args the command line arguments
     */
    private int value;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (value > 0) {
            value--;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        DecreasingCounter counter = new DecreasingCounter(2);

        System.out.println(counter.value);
        counter.decrease();
        System.out.println(counter.value);
        counter.decrease();
        System.out.println(counter.value);
        counter.decrease();
        System.out.println(counter.value);

    }

}
