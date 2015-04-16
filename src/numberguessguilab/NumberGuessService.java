/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessguilab;

/**
 *
 * @author Mark
 */
public class NumberGuessService {
    private NumberGuessResult ngr;

    public NumberGuessService(NumberGuessResult ngr) {
        this.ngr = ngr;
    }
    
    public void setNums(int num1, int num2){
        if(num1<=num2){
         ngr.setLowEnd(num1);
         ngr.setHighEnd(num2);
        }else{
         ngr.setHighEnd(num1);
         ngr.setLowEnd(num2);
        }
        ngr.generateAns();
     }

    public NumberGuessResult getNgr() {
        return ngr;
    }

    public void setNgr(NumberGuessResult ngr) {
        this.ngr = ngr;
    }
    
}
    
