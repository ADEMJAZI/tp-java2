public class Point {
    int abs;
    int ord;
    static int nombre;
    Point(){
        abs=0;
        ord=0;
    }
    void setCordonneePoint(int u,int v){
        abs=u;
        ord=v;
    }
    void  translate(int u,int v){
        abs=abs+u;
        ord=ord+v;
    }
    void affichePoinet(){
        System.out.println("les cord de la point et"+abs+","+ord);
    }
    boolean origine(){
       return (this.abs == 0  && this.ord==0);
    }
    boolean Egale(Point q){
        return (this.abs==q.abs) && (this.ord==q.ord);
    }
void setCoordonnePoint(Point q){
       abs=q.abs;
       ord= q.ord;
}
Point symetrie(){
        Point sp=new Point();
        sp.abs=0-abs;
        sp.ord=0-ord;
        return  sp;
}
}
