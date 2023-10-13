public class test {
    public static void main(String[] args) {
        Point p = new Point();
        Point q = new Point();

        p.setCordonneePoint(3, 4);
        q.setCordonneePoint(5, 6);

        p.affichePoinet();
        q.affichePoinet();

        if(p.origine()){
            System.out.println("le p est l'origine de repere");
        }else {
            System.out.println("le cord de p not null");
        }
         if(p.Egale(p)){
             System.out.println("la point p egale");
         }else {
             System.out.println("la point deffirent ");
         }
         p.affichePoinet();
         Point rs=p.symetrie();
        System.out.println("symetrie de cette poit est :"+rs.abs);
        System.out.println("le nombre de point ="+Point.nombre);




    }
}
