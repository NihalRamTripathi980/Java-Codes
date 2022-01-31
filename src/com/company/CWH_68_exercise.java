package  com.company;
//package com.codewithharry;
// exercise no. 5


class rectangle1 {
    int length, breath;

    // setter;
    public void setLength(int n) {
        length = n;
    }


    public void setBreath(int n) {
        breath = n;
    }

    // getter
    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }

    public int area() {
        return length * breath;
    }
}
    class square {
        int size;

        public void setSize(int n) {
            size = n;
        }

        public int getSize() {
            return size;
        }

        public int area() {
            return size * size;
        }
    }
        class circle1 {
            int radius;

            public void setRadius(int n) {
                radius = n;
            }

            public int getRadius() {
                return radius;
            }


            public double area() {
                return Math.PI * radius * radius;
            }

            public double perimeter() {
                return 2 * Math.PI * radius;
            }
        }
            class cylinder1 extends circle {
                int height;

                public void setHeigth(int n) {
                    this.height = n;
                }

                public int getHeigth() {
                    return height;
                }

                public double Volume() {
                    return Math.PI * radius *radius* this.height;
                }

                public double Surface() {
                    return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * this.height;
                }
            }

                    public class CWH_68_exercise {
                        public static void main(String [] args){


                            //   public class exertice_5{


                            rectangle1 r= new rectangle1();
                            r.setLength(23);
                            r.getLength();
                            r.setBreath(24);
                            r.getBreath();
                            r.area();

// Object for circle
                          /*  circle1 c = new circle1();
                            c.setRadius(40);
                            c.getRadius();
                            c.area();
                            c.perimeter();

                           */

// Object for square
                            square s = new square();
                            s.setSize(2);
                            s.getSize();
                            System.out.println("area of aquare" +s.area());

// Object for cylinder
                            cylinder1 cy = new cylinder1();
                            cy.setHeigth(4);
                            cy.getHeigth();
                            cy.Volume();
                            System.out.println("surface area of cylinder   "+ cy.Surface());

                            // I can also create constructor class name shape , and by extending this class for rectangle ,sphere ,circle .... etc
                            // this is easy step for programmer but missed that step
                            // with these steps we can create only one Getter & Setter but in my program i use many getter & setter ,and this is heavy

                        }
                    }

