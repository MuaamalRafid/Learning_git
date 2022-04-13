
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {

  
        
        Scanner in = new Scanner(System.in);

        MainLoop:
        for (;;) {

          System.out.println("                         Start Minu                            ");
          System.out.println("__________________________________________________________________");
            System.out.println("           1-Choece 1 To One Daimantional Array");
            System.out.println("           2-Choece 2 To Tow Daimantional Array ");
            System.out.println("           3-Choece 3 To Three Daimantional Array ");
            System.out.println("           4-Choece 4 To Tringal  Array ");
            System.out.println("           5-Choece 5 To Strings  Methods ");
            System.out.println("           6-Choece 6 To LinkedList ");
            
            int Choece = in.nextInt();
            if(Choece==1){
                System.out.print("Enter Araay Size :");
                int array1Size = in.nextInt();
                int[] array1 = new int[array1Size];
                
                for (int i = 0; i < array1.length; i++) {
                    System.out.print("Enter Araay Element :");
                    array1[i]= in.nextInt();
                }
                
                LoopOne :
                for(;;){

                
                System.out.println("1- Prees 1 to Print Array");
                System.out.println("2- Prees 2 to Find the Minmam Number");
                System.out.println("3- Prees 3 to Find the Maximam Number");
                System.out.println("4- Prees 4 To Find Sum ");
                System.out.println("5- Prees 5 to Search Number In Array");
                System.out.println("6- Prees 0 to Return Start Menu");

                int ChoeceAction = in.nextInt();
                switch (ChoeceAction) {
                    case 1:
                    System.out.print("Array = [");
                    for (int i = 0; i < array1.length; i++) {
                      System.out.print(array1[i]+",");
                    }
                    System.out.println("]");
                        break;

                        case 2:
                        int min= array1[0];
                        for ( int i = 0; i < array1.length; i++) {
                            
                            if(array1[i]<array1[0])
                            min = array1[i];
                        }
                        System.out.println("min = "+min);
                        break;

                        case 3:
                        int max= array1[0];
                        for ( int i = 0; i < array1.length; i++) {
                            
                            if(array1[i]>array1[0])
                            max = array1[i];
                        }
                        System.out.println("Max Number = "+max);
                        break;

                        case 4:
                        int sum = 0;
                        for (int i = 0; i < array1.length; i++) {
                          sum += array1[i];
                        }
                        System.out.println("Sum = "+sum);
                        break;

                        case 5:
                        System.out.println("Enter Number ");
                        int Number = in.nextInt();
                        for (int i = 0; i < array1.length; i++) {
                          if(array1[i]==Number)
                          {
                            System.out.println("Number Is in Array In Index: "+i);
                          }
                        }   
                      
                        System.out.println("Number Is not in the Array");                
                        break;


                case 0:
                        break LoopOne;
                
                    default :
                        System.out.println("Number is InCorrect Please Enter Correct Number ");
                        break;
                }

              }
            }
            else if(Choece == 2)
            {
                System.out.print("Enter Araay Column Size :");
                int array2Column = in.nextInt();
                System.out.print("Enter Araay Row Size :");
                int array2Row = in.nextInt();
                int[][] array2 = new int[array2Column][array2Row];
                for (int i = 0; i < array2.length; i++) {
                    for (int j = 0; j < array2[i].length; j++) {
                    System.out.print("Enter Araay Element :");
                    array2[i][j]= in.nextInt();
                    }
                }

                LoopTow:
                for(;;){
                System.out.println("1- Prees 1 to Print Array");
                System.out.println("2- Prees 2 to Find the Minmam Number");
                System.out.println("3- Prees 3 to Find the Maximam Number");
                System.out.println("4- Prees 4 To Find Sum ");
                System.out.println("5- Prees 5 to Search Number In Array");
                System.out.println("6- Prees 0 to Return Start Menu");

                int ChoeceAction = in.nextInt(); 
                switch (ChoeceAction) {
                  case 1:
                    
                     System.out.print("[");
                    for (int i = 0; i < array2.length; i++) {
                      for (int j = 0; j < array2[i].length; j++) {
                        System.out.print(array2[i][j]+",");
                      }
                      System.out.println("");
                    }
                    System.out.print("]");
                    System.out.println("");

          
                    break;

                    case 2:
                    int min= array2[0][0];
                    for ( int i = 0; i < array2.length; i++) {
                        for (int j = 0; j < array2[i].length; j++) {
                          if(array2[i][j]<array2[0][0])
                          min = array2[i][j];
                        }
                    }
                    System.out.println("Min Number = "+min);
                    break;
                    case 3:
                    int max= array2[0][0];
                    for ( int i = 0; i < array2.length; i++) {
                        for (int j = 0; j < array2[i].length; j++) {
                          if(array2[i][j]>array2[0][0])
                          max = array2[i][j];
                        } 
                    }
                    System.out.println("max Number = "+max);
                    
                    break;
                    case 4:
                    int sum = 0;
                    for (int i = 0; i < array2.length; i++) {
                      for (int j = 0; j < array2[i].length; j++) {
                        sum+=array2[i][j];
                      }
                    }
                    System.out.println("Sum = "+sum);
                    break;

                    case 5:
                    {


            System.out.println("Enter Number ");
                    int Number = in.nextInt();
                    boolean  is = true;
                    for (int i = 0; i < array2.length; i++) {
                      for (int j = 0; j < array2[i].length; j++) {
                        if(array2[i][j]==Number)
                        {
                          System.out.println("Number Is in Array In Index: "+"["+i+","+j+"]");
                           is = false;
                        }
                      }
                    }   
                    if(is)
                    System.out.println("Number Is not in the Array");
                    break; 
                    }

                    case 0:
                    break LoopTow;
                
                  default:
                  System.out.println("Number is InCorrect Please Enter Correct Number ");
                    break;
                }
              } 
            }

            else if (Choece == 3)
            {
              System.out.print("Enter Araay Column Size :");
                int array3Column = in.nextInt();
                System.out.print("Enter Araay Row Size :");
                int array3Row = in.nextInt();
                System.out.print("Enter Araay Level  :");
                int array3Level = in.nextInt();

                int[][][] array3 = new int[array3Level][array3Row][array3Column];
               
                System.out.println("");

                for (int k = 0; k < array3.length; k++) {
                  for (int i = 0; i < array3.length; i++) {
                    for (int j = 0; j < array3.length; j++) {
                      System.out.print("Enter Araay Level "+(k+1)+" Element :");
                      array3[k][i][j] = in.nextInt();
                    }
                  }
                }

                LoopThree:
                for(;;){
                System.out.println("1- Prees 1 to Print Array");
                System.out.println("2- Prees 2 to Find the Maximam Number");
                System.out.println("3- Prees 3 to Find the Minmam Number");
                System.out.println("4- Prees 4 To Find Sum ");
                System.out.println("5- Prees 5 to Search Number In Array");
                System.out.println("6- Prees 0 to Return Start Menu");


                int ChoeceAction = in.nextInt(); 
                switch (ChoeceAction) {
                  case 1:
                    for (int k = 0; k < array3.length; k++) {
                      System.out.println("Array Level "+(k+1));
                    
                      for (int i = 0; i < array3.length; i++) {
                        for (int j = 0; j < array3.length; j++) {
                          System.out.print(array3[k][i][j]+",");
                        }
                        if(i>array3.length-1)
                        break;
                        else
                        System.out.println("");
                      }
                      
                      System.out.println("______________________ ");
                    }
                    break;


            case 2:
                    for (int k = 0; k < array3.length; k++) {
                      int max = array3[k][0][0];
                      for (int i = 0; i < array3.length; i++) {
                        for (int j = 0; j < array3.length; j++) {
                          if(array3[k][i][j]>max)
                          max = array3[k][i][j];
                        }
                      }
                      System.out.println("The Max Number In Araay Level "+(k+1)+" = "+max);
                    }
                    
                    break;
                    case 3:
                    for (int k = 0; k < array3.length; k++) {
                      int min = array3[k][0][0];
                      for (int i = 0; i < array3.length; i++) {
                        for (int j = 0; j < array3.length; j++) {
                          if(array3[k][i][j]<min)
                          min = array3[k][i][j];
                        }
                      }
                      System.out.println("The min Number In Araay Level "+(k+1)+" = "+min);
                    }
                    break;
                    case 4:
                    int sums =0;
                    for (int k = 0; k < array3.length; k++) {
                      int sum = 0;
                      for (int i = 0; i < array3.length; i++) {
                        for (int j = 0; j < array3.length; j++) {
                          sum = array3[k][i][j];
                        }
                      }
                       sums+= sum;
                      System.out.println("Sum Of Araay Level "+(k+1)+" = "+sum);
                    }
                    System.out.println("");
                    System.out.println("Sums Off All Level In Array = "+sums);


                    break;

                    case 5:
                    {

                    break; 
                    }

                    case 0:
                    break LoopThree;
                
                  default:
                  System.out.println("Number is InCorrect Please Enter Correct Number ");
                    break;
                }
              } 
            }
            else if(Choece == 4){

            }

            else if(Choece == 5){
             
                StringLoop:
                for(;;){
                System.out.println("1- Prees 1 to Print String");
                System.out.println("2- Prees 2 to Find the IndexOf Char");
                System.out.println("3- Prees 3 to Generate Char Array From String");
                System.out.println("4- Prees 4 To Trim String ");
                System.out.println("5- Prees 5 to Search Char In String");
                System.out.println("6- Prees 6 to ToUpperCase ");
                System.out.println("6- Prees 7 to ToLowerCase ");
                System.out.println("6- Prees 8 to SubString From To ");
                System.out.println("6- Prees 9 to Replace Char to Anther Char  ");
                System.out.println("6- Prees 10 to Replace Word to Anther Word  ");

                int ChoeceAction = in.nextInt();
                
                switch (ChoeceAction) {
                    case 1:
                        
                        break;

                        case 2:
                        
                        break;

                        case 3:
                        
                        break;

                        case 4:
                        
                        break;

                        case 5:
                        
                        break;

                        case 6:
                        
                        break;

                        case 7:
                        
                        break;

                        case 8:
                        
                        break;

                        case 9:
                        
                        break;

                        case 10:
                        
                        break;
                
                    default:
                        break;
                }

                }

            }

            else if(Choece == 6){
                System.out.println("Welcome In LinkedList Class");
                System.out.println("Enter Who Many Elemet You Wante Add");
                LinkedList list = new LinkedList();
                int elemetAdd =  in.nextInt();
                for (int i = 0; i < elemetAdd; i++) {
                  System.out.print("Element :");  list.addLast(in.nextInt());
                }
                
                LinkedListLoop:
                for(;;){
                    System.out.println("1- Prees 1 to Print LinkedList As Array ");
                    System.out.println("2- Prees 2 to Add Element At Last ");
                    System.out.println("3- Prees 3 to Add Element At First");
                    System.out.println("4- Prees 4 To remove Element from last ");
                    System.out.println("5- Prees 5 to remove Element from First");
                    System.out.println("6- Prees 6 to Return Size Of LinkedList Now");
                    System.out.println("7- Prees 7 to Return IndexOf Element");
                    System.out.println("8- Prees 8 to Return Boolean if LinkedList contain Element");
                    System.out.println("9- Prees 0 to Return To Main Menu");

                    int ChoeceAction = in.nextInt(); 
                    switch (ChoeceAction) {
                      case 1:
                      System.out.println(Arrays.toString(list.toArray()));
                      break;
                      case 2:
                      System.out.println("LinkedList Before AddLast");
                      System.out.println(Arrays.toString(list.toArray()));
                      System.out.print("Enter Element :"); list.addLast(in.nextInt());
                      System.out.println("LinkedList Affter AddLast");
                      System.out.println(Arrays.toString(list.toArray()));
                      break;
                      case 3:
                      System.out.println("LinkedList Before AddFirst");
                      System.out.println(Arrays.toString(list.toArray()));
                      System.out.print("Enter Element :"); list.addFirst(in.nextInt());
                      System.out.println("LinkedList Affter AddFirst");
                      System.out.println(Arrays.toString(list.toArray()));
                      break;

                      case 4:
                      System.out.println("LinkedList Before removeLast");
                      System.out.println(Arrays.toString(list.toArray()));
                      list.removeLast();
                      System.out.println("LinkedList Affter removeLast");
                      System.out.println(Arrays.toString(list.toArray()));
                      break;
                    
                      case 5:
                      System.out.println("LinkedList Before removeFirst");
                      System.out.println(Arrays.toString(list.toArray()));
                      list.removeFirst();
                      System.out.println("LinkedList Affter removeFirst");
                      System.out.println(Arrays.toString(list.toArray()));
                      break;
                      case 6:
                      System.out.println(Arrays.toString(list.toArray()));
                      System.out.println("LinkedList Size Is :"+list.size()); 
                      break;
                      case 7:
                      System.out.print("Enter Element You Need Find Index :"); int item = in.nextInt();
                      System.out.println("IndexOf("+item+")"+" = "+list.indexOf(item));
                      break;
                      case 8:
                      System.out.print("Enter Element You Need Find contain :"); int item1 = in.nextInt();
                      System.out.println("LinkedList contain("+item1+")"+" ? "+" = "+list.contine(item1));
                      break;
                      case 9:
                      break LinkedListLoop;

                    }

                    }
                
                }
            }

            }
            
            
            
            
        }
        
      
