#!/usr/bin/env groovy

//obyavlenie operaciy
//Zamikanie
def plusdva = { a, b -> a + b };
def minusdva = { a, b -> a - b };
def umnoj = { a, b -> a * b };
def delenie = { a, b -> a / b };
def vmeste = { a, b, c -> a * c + b * c };
//def plus = { a -> a + a };
//def minus = { a -> a - a };
//def minus = { a, b -> a - b};

String options = ['plusdva', 'plus', 'minusdva', 'minus', 'umnoj', 'delenie', 'vmeste']

//Gstring
def start = 'starting';
def calc = 'Calculator';
//println '${calc} ${start}';
println "${calc} ${start}";

println("Vibiraem chto hotim - plus, plusdva, minus, minusdva, umnoj, delenie, vmeste");

String userChoice = System.in.newReader().readLine();

userChoice = userChoice.toLowerCase();

if(!options.contains(userChoice))
{
    println("Ne ta operaciya");
}
 else 
{
   if(userChoice == 'plusdva')
        {
        println("Vvedite pervoe chislo");
        int num1 = System.in.newReader().readLine() as Integer;
        println("Vvedite vtoroe chislo");
        int num2 = System.in.newReader().readLine() as Integer;
        println("Itak, vnimanie! Budeeet");
        println(plusdva(num1, num2));
        }
else if(userChoice == 'plus')
{
        println("Vvedite skolko budet chisel");
        int kol = System.in.newReader().readLine() as Integer;
        int sum=0;
        //int i = 1;
        int[] array = new int[kol];
        println("Vvedite chislo");
        for (int i=0; i < kol; i++)
        {
          // считываем введенный пользователем элемент в массив
        array[i] = System.in.newReader().readLine() as Integer;
        }
        // проходим по всем элементов массива и суммируем каждое число
        for( int num : array) 
        {
          sum = sum+num;
        }      
        System.out.println("Сумма элементов равна: " + sum);   
}
 else if(userChoice == 'minusdva')
{
        println("Vvedite pervoe chislo");
        int a = System.in.newReader().readLine() as Integer
     //   int a = a?:"b";
     // int num1 = System.in.newReader().readLine() as Integer;
        println("Vvedite vtoroe chislo");
        int b = System.in.newReader().readLine() as Integer
     // int num2 = System.in.newReader().readLine() as Integer;
        println("Itak, vnimanie! Budeeet");
     // println(minus(num1, num2));
        println(a.minus(b));
    }
 else if(userChoice == 'minus')
{
        println("Vvedite skolko budet chisel");
        int kol = System.in.newReader().readLine() as Integer;
        int min=0;
        //int i = 1;
        int[] array = new int[kol];
        println("Vvedite chislo");
        for (int i=0; i < kol; i++)
        {
          // считываем введенный пользователем элемент в массив
        array[i] = System.in.newReader().readLine() as Integer;
        }
        // проходим по всем элементов массива и вычитаем каждое число
        for( int num : array) 
        {
          //min = array[0] - array[1] - array[2] - array[3];
          min = -num;
        }      
        System.out.println("Разность элементов равна: " + min);   
}   
 else if(userChoice == 'umnoj')
{
        println("Vvedite pervoe chislo");
        int num1 = System.in.newReader().readLine() as Integer;
        println("Vvedite vtoroe chislo");
        int num2 = System.in.newReader().readLine() as Integer;
        println("Itak, vnimanie! Budeeet");
        println(umnoj(num1, num2));
    }
 else if(userChoice == 'delenie')
{
        println("Vvedite pervoe chislo");
        int num1 = System.in.newReader().readLine() as Integer;
        println("Vvedite vtoroe chislo");
        int num2 = System.in.newReader().readLine() as Integer;
        println("Itak, vnimanie! Budeeet");
        println(delenie(num1, num2));
    } 
  else if(userChoice == 'vmeste')
{
        println("Vvedite pervoe chislo");
        int num1 = System.in.newReader().readLine() as Integer;
        println("Vvedite vtoroe chislo");
        int num2 = System.in.newReader().readLine() as Integer;
        println("Vvedite tretee chislo");
        int num3 = System.in.newReader().readLine() as Integer;
        println("Itak, vnimanie! Budeeet");        
        println(vmeste(num1, num2, num3));
    } 
else 
{
        println("Oshibka");
    }
}
