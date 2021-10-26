package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here


//1* Sugeneruokite masyvą iš 30 elementų (indeksai nuo 0 iki 29), kurių reikšmės yra atsitiktiniai skaičiai nuo 5 iki 25.

// (int)(Math.random()*20)+5 nuo 5 iki 25

//    int[] Array = new int[30];
//
//        for (int i = 0; i < 30; i++) {
//            Array[i] = (int)(Math.random()*20)+5;
//            System.out.println( i + " nuo elementas "+Array[i]);
//        }


//2 a* Suskaičiuokite kiek masyve yra reikšmių didesnių už 10;

//            int[] Array = new int[30];
//            int count=0;
//
//        for (int i = 0; i < 30; i++) {
//            Array[i] = (int)(Math.random()*20)+5;
//            System.out.println("elementas  "+ i + " jo reiksme lygi  "+Array[i]);
//            if (Array[i]>10){count++;}
//        }
//        System.out.println("is viso uz 10 daugiau  yra " + count);


        // int [y][x] arr2d - dvimatis masyvas, pirma reiksme eilutes, antra masyvo elementas

        // arr3d [z][y][x]

//        int[] randomNumbers = {618, 5, 455, 44, 444, 66};
//        for (int i = 0; randomNumbers.length > i; i++) { //objektiniame programavime randomNumber.size
//            System.out.println(randomNumbers[i]);
//        }
//
//        int[] newArr = new int[5] // jau is karto yra 5 elementai, kurie pagal taisykle 0 0 0 0 0

        //error ArrayIndecOutOfBounds vadinasi is masyvo ribu isejo

//rusiavimas
//        for (int i = 0; randomNumbers.length > i; i++) {
//            System.out.println(randomNumbers[i]);
//        }
//
//        for (int i = 0; randomNumbers.length - 1 > i; i++) {
//            int tmp = randomNumbers[i];
//            randomNumbers[i] = randomNumbers[i + 1];
//            randomNumbers[i + 1] = tmp;
//        } // cia buvo  1 2 3 4  pasikeite i 2 3 4 1 pastumeme
//
//        for (int i = 0; randomNumbers.length - 1 > i; i++) {
//            if (randomNumbers[i] > randomNumbers[i + 1]) {
//                int tmp = randomNumbers[i];
//                randomNumbers[i] = randomNumbers[i + 1];
//                randomNumbers[i + 1] = tmp;
//            }
//        } // viena karta veiksma atlieka kur dedesni pastuma per viena vieta, o kitu neliecia


//        for (int a = 0; randomNumbers.length > a; a++) {
//            for (int i = 0; randomNumbers.length - 1 > i; i++)
//                if (randomNumbers[i] > randomNumbers[i + 1]) {
//                    int tmp = randomNumbers[i];
//                    randomNumbers[i] = randomNumbers[i + 1];
//                    randomNumbers[i + 1] = tmp;
//                }
//        }
// ciklas kur surusiuoja skaicius 1 55 22 33 ir gaunasi 1 22 33 55

//        count = 0;
//        for (int a = 0; randomNumbers.length > a; a++) {
//            for (int i = a + 1; randomNumbers.length - 1 > i; i++)
//                if (randomNumbers[a] < randomNumbers[i]) {
//                    int tmp = randomNumbers[a];
//                    randomNumbers[a] = randomNumbers[i];
//                    randomNumbers[i] = tmp;
//                }
//        }
//        count++;
//        System.out.println();
//        System.out.println(count);
//        for (int i = 0; i < randomNumbers.length; i++) {
//            System.out.println(randomNumbers[i]+ "");
//
//        }

            //bubble sort, ciklas nuo didziausio iki maziausio surisiuoju, bet iteraciju per pus maziau




// max ir maxindex

//2 b* Raskite didžiausią masyvo reikšmę ir jos indeksą arba indeksus jeigu yra keli ir atspausdinkite.


//            int[] Array = new int[30];
//            int count=0;
//            int max = 0;
//            int maxIndex = 0;
//
//        for (int i = 0; i < 30; i++) {
//            Array[i] = (int)(Math.random()*20)+5;
//
//        }
//                for (int a = 0; 30 > a; a++) {
//            for (int i = a + 1; 30 - 1 > i; i++)
//                if (Array[a] > Array[i]) {
//                    int tmp = Array[a];
//                    Array[a] = Array[i];
//                    Array[i] = tmp;
//                }
//                    System.out.println("elementas  "+ a + " jo reiksme lygi  "+Array[a]);
//        }
//        for (int i = 0; 29 > i; i++) {
//            if (Array[i] > Array[i + 1]) {
//                max = Array[i];
//                maxIndex = i;
//            }
//        }
//
//        System.out.println("Indeksas "+maxIndex+"  kurio reiksme  "+max);

//2* c Suskaičiuokite visų porinių (lyginių) indeksų reikšmių sumą;

//            int[] Array = new int[5];
//            int count=0;
//            int suma = 0;
//
//        for (int i = 0; i < 5; i++) {
//            Array[i] = (int)(Math.random()*20)+5;
//            System.out.println("elementas  "+ i + " jo reiksme lygi  "+Array[i]);
//
//        }
//
//        for (int i = 0; i < 5; i++) {
//            if (i % 2 == 0){
//                suma = suma + Array[i];
//                System.out.println(Array[i]);}
//        }
//        System.out.println("Lyginiu indeksu suma  "+suma);

//2*d Sukurkite naują masyvą, kurio reikšmės yra 1 uždavinio masyvo reikšmes minus tos reikšmės indeksas;

//        int[] Array = new int[30];
//        int count=0;
//        int[] newA = new int[30];
//
//
//        for (int i = 0; i < 30; i++) {
//            Array[i] = (int) (Math.random() * 20) + 5;
//            System.out.println("elementas  " + i + " jo reiksme lygi  " + Array[i]);
//        }
//
//            for (int j = 0; j < 30; j++) {
//                count = Array[j];
//                newA[j] =count -j;
//                System.out.println("naujas elementas  " + j + " jo reiksme lygi  " + newA[j]);
//            }

//2*e Papildykite masyvą papildomais 10 elementų su reikšmėmis nuo 5 iki 25, kad bendras masyvas padidėtų iki indekso 39; (tam reikės sukurti naują masyvą, ir baigus jį pildyti priskirti pirmojo kintamąjam)



//        int[] Array = new int[30];
//        int a=30;
//        int[] newA = new int[39];
//
//        for (int i = 0; i < 30; i++) {
//            Array[i] = (int) (Math.random() * 20) + 5;
//            System.out.println("elementas  " + i + " jo reiksme lygi  " + Array[i]);
//        }
//
//        for (int i = 0; i < 30; i++) {
//            newA[i] = Array[i];
//        }
//
//        for (int i = 30; i < 39; i++) {
//            newA[i] = (int) (Math.random() * 20) + 5;
//        }
//
//        for (int i = 0; i < 39; i++) {
//            System.out.println("elementas  " + i + " jo reiksme lygi  " + newA[i]);
//        }

//2*f Iš masyvo elementų sukurkite du naujus masyvus. Vienas turi būti sudarytas iš neporinių indekso reikšmių, o kitas iš porinių;


//        int[] Array = new int[30];
//        int[] newA = new int[30];
//        int[] newB = new int[30];
//        int j = 0;
//        int k = 0;
//
//        for (int i = 0; i < 30; i++) {
//            Array[i] = (int) (Math.random() * 20) + 5;
//            System.out.println("elementas  " + i + " jo reiksme lygi  " + Array[i]);
//
//            if (i % 2 == 0 ) {
//                newA[j] = Array[i];
//                j++;
//            }
//            if (i % 2 != 0) {
//                newB[k] = Array[i];
//                k++;
//            }
//        }
//
//        for (int i = 0; i < 30; i++) {
//            System.out.println("lyginis elementas "+i+" reiksme "+newA[i]);
//            System.out.println("nelyginis elementas "+i+" reiksme "+newB[i]);
//
//        }

//2*g Pirminio masyvo elementus su poriniais indeksais padarykite lygius 0 jeigu jie didesni už 15;


//
//        int[] Array = new int[30];
//
//        for (int i = 0; i < 30; i++) {
//            Array[i] = (int) (Math.random() * 20) + 5;
//            System.out.println("elementas  " + i + " jo reiksme lygi  " + Array[i]);
//            if (i == 2 || i == 3 || i == 5 || i == 7 || i == 11 || i == 13 || i == 17 || i == 19 || i == 23 || i == 29) {
//
//                if (Array[i] > 15){Array[i] = 0;}
//            }
//            }
//
//        for (int i = 0; i < 30; i++) {
//            System.out.println("naujas elementas  " + i + " jo reiksme lygi  " + Array[i]);}



//2*h Suraskite pirmą (mažiausią) indeksą, kurio elemento reikšmė didesnė už 10;


//        int[] Array = new int[30];
//        int[] min = new int[30];
//        int j = 0;
//
//
//
//        for (int i = 0; i < 30; i++) {
//            Array[i] = (int) (Math.random() * 20) + 5;
//            System.out.println("elementas  " + i + " jo reiksme lygi  " + Array[i]);
//            if (Array[i] > 23) {
//                min[j] = i;
//                System.out.println("maziausia indekso reiksme " + min[j]);
//            }
//        }
//
//3.* Sugeneruokite masyvą, kurio reikšmės atsitiktinės raidės A, B, C ir D, o ilgis
//        200. Suskaičiuokite kiek yra kiekvienos raidės.


//        Random random = new Random();
//        String setOfCharacters = "ABCD";
//        char[] Array = new char[200];
//        int a=0;
//        int b=0;
//        int c=0;
//        int d=0;
//
//        for (int i = 0; i < 200; i++) {
//            int randomInt = random.nextInt(setOfCharacters.length());
//            char randomChar = setOfCharacters.charAt(randomInt);
//
//            Array[i] = randomChar;
//
//            System.out.println("Random character from string: " + Array[i]);
//
//            if (Array[i] == 'A'){a++;}
//            if (Array[i] == 'B'){b++;}
//            if (Array[i] == 'C'){c++;}
//            if (Array[i] == 'D'){d++;}
//
//        }
//        System.out.println("A "+a+" B "+b+" C "+c+" D "+d);






























    }




}