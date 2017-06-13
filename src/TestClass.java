import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception 
    {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double[] array;
        BinarySearchComparator comparator = new BinarySearchComparator();
        PriorityQueue<Double> bst = new PriorityQueue<>(100, comparator);
        String line = br.readLine();
        String tmp = "";
        int N = Integer.parseInt(line);
        Double x = 0.0;
        Double key = 0.0;
        line = br.readLine();
        for (int i = 0; i < N; i++) 
        {
            if(line.contains(" "))
            {
                tmp = line.substring(0, line.indexOf(" ")+1);
                x = Double.parseDouble(tmp.trim());
                line = line.substring(line.indexOf(" ")+1, line.length());
            }
            else
            {
                tmp = line;
                x = Double.parseDouble(tmp.trim());
            }
            /*
            if(i == 0)
            {
                //node = new BinarySearchTree.Node(x, null, null);
                //bst.setRoot(node);
                
              bst.add(x);  
            }
            else
            {
                bst.add(x);
            }
            */
            bst.add(x);
        }
        line = br.readLine();
        N = Integer.parseInt(line);
        for(int i = 0; i < N;i++)
        {
            line = br.readLine();
            if(line.equals("2"))
            {
                Double max = bst.peek();
//                array = new Double[bst.size()];
//                bst.toArray(array);
//                for(int p = 0; p < array.length; p++)
//                {
//                    if(array[p] > max)
//                    {
//                        max = array[p];
//                    }
//                }
                
                System.out.printf( "%.0f\n",max);
            }
            else
            {
                line = line.replaceFirst("1", "").trim();
                tmp = line;
                x = Double.parseDouble(tmp.trim());
                bst.add(x);
            }
        }
        
    }   
    public static class BinarySearchComparator implements Comparator<Double>
    {

        @Override
        public int compare(Double o1, Double o2) {
            if(o1.equals(o2))
            {
                return 0;
            }
            else if(o1 < o2)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        
        
        
        
        

    }
}
    


