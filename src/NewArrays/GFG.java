package NewArrays;

import java.util.Objects;

public class GFG implements Cloneable {

    private int i;
    private int j;
    private Address a;

    @Override
    public Object clone() throws CloneNotSupportedException{
        return (GFG)super.clone();
    }

    @Override
    public String toString() {
        return "GFG{" +
                "i=" + i +
                ", j=" + j +
                ", a=" + a +
                '}';
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public Address getA() {
        return a;
    }

    public void setA(Address a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GFG)) return false;
        GFG gfg = (GFG) o;
        return i == gfg.i && j == gfg.j && a.equals(gfg.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j, a);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        GFG g = new GFG();
        g.i = 1;
        g.j =2;
        Address a = new Address("Ropar");
        g.setA(a);
        GFG g1 = (GFG) g.clone();
        System.out.println(g);
        System.out.println(g1);
        a.setCity("Mohali");
        g.setI(3);
        System.out.println(g);
        System.out.println(g1);
        System.out.println(g1 == g);
    }

}
