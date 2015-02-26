package lab2;
import org.nfunk.jep.JEP;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Interpretor {
    String[] r;
    static HashMap <String,Integer>mymap;
    Interpretor(){
        mymap=new HashMap();
        
    }
    
    public boolean interpret(String path){
            
            
		try {
			
			BufferedReader in = new BufferedReader
			(new FileReader(path));
			String str,itos;
			while ((str = in.readLine()) != null) {
                                if(str.startsWith("#")){
                                    continue;
                                }
                                
                                                                
				if(str.contains("Let") || str.contains("let") || str.contains("LET")){
					r=str.split(" ");
					try{
						Integer.parseInt(r[1]);
							System.out.println("invalid syntax,number on lhs!!!");
							//return false;
						
					}catch(Exception e){
						putinhash(r);
						
					}
				}
                                else if(str.contains("Print") || str.contains("print") || str.contains("PRINT")){
                                    if(print(str)==false)
                                        System.out.println("");
                                       
                                    else
                                       
                                        System.out.println("");
                                    
                                }
				else{
                                    String trimmed=str.replaceAll("\\s","");
                                    JEP myParser = new JEP();
                                    String regex = "[0-9]+"; 
                                    String data = ""; 
                                    int rt=0;
                                    String[]  chk=str.split(" ");
                                   for(int k=2;k<chk.length;k++){
                                       if(mymap.get(chk[k])!=null){
                                           rt=mymap.get(chk[k]);
                                           char ty=Character.forDigit(rt,10);
                                           itos="" +rt;
                                           chk[k]=itos;
                                       }
                                       else{
                                           data=chk[k];
                                           if(data.matches(regex)){
                                               rt=Integer.parseInt(data);
                                               char ty=Character.forDigit(rt,10);
                                               itos="" +rt;
                                               chk[k]=itos;
                                           }
                                           
                                       }
                                   }
                                   String d="";
                                   for(int co=2;co<chk.length;co++){
                                       d=d.concat(chk[co]);
                                   }
                                   d=d.replaceAll("//s", "");
                                   myParser.parseExpression(d);
                                   int myresult= (int) myParser.getValue();
                                   
                                   if(myresult==0){
                                       System.out.println("one of the operands on rhs is not defined!");
                                   }
                                   else{
                                       mymap.put(chk[0], myresult);
                                   }
                                   //System.out.println("evaluated : "+myresult);
                                }
			}
		}
		catch (IOException e) {
			System.out.println("cannot open file");
		}
		return true; //this should be checked!!!!!!!!
	}
        public boolean print(String str){
            String[] r=str.split(" ");
            if(r[1].charAt(0)=='\"' && str.endsWith("\"")){
                System.out.println(str.substring(str.indexOf("\"")+1,str.length()-1));
                return true;
            }
            if(mymap.get(r[1])!=null){
                System.out.print(mymap.get(r[1]));
                
            }
            else{
                System.out.print(r[1]+" is not defined");
                return false;
            }
        return true;
        }
        
        public void putinhash(String[] tokenarray){
            
            try{
                Integer.parseInt(tokenarray[3]);
                mymap.put(tokenarray[1],Integer.parseInt(tokenarray[3]));
                
            }catch(Exception e){
                if(mymap.get(tokenarray[3])==null){
                    
                    System.out.println("Exception! "+tokenarray[3]+" is not defined!");
                }
                else{
                    mymap.put(tokenarray[1],mymap.get(tokenarray[3]));
                }
            }
            
        }
}
