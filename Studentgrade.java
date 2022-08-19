class Studentgrade {
    public static void main(String[] args) {
        
    
double phy = 70;
double chem =50;
double maths = 10;
double eng = 20;
  

double total = phy + chem + maths + eng;

  

double per = (total / 400) * 100;


if ((per > 90) && (per < 100)) {
    System.out.print("A+");
} else if ((per > 80) && (per < 90)) {
    System.out.print("A");
} else if ((per > 70) && (per < 80)) {
    System.out.print("B+");
} else if ((per > 60) && (per < 70)) {
    System.out.print("B");
} else if ((per > 50) && (per < 60)) {
    System.out.print("C");
} else if ((per > 40) && (per < 50)) {    
    System.out.print("D");
} else if ((per > 30) && (per < 40)) {
    System.out.print("E");
}

else {
    System.out.println("F");
}
    }}
