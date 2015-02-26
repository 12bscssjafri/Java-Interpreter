/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;


public class UnitTests {
        
    public void test(String Path){
        Interpretor a=new Interpretor();
        a.interpret(Path);
    }
    public static void main(String[] args){
        UnitTests u= new UnitTests();
        
        String path;
        System.out.println("___________________________");
        path="AddandSubtract.txt";
        u.test(path);
        System.out.println("___________________________");
        path="MultiplyandDivide.txt";
        u.test(path);
        System.out.println("___________________________");
        path="Precedence.txt";
        u.test(path);
        System.out.println("___________________________");
    }
}
