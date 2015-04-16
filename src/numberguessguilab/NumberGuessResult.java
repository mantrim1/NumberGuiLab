/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessguilab;


import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Mark
 */
public class NumberGuessResult {
    private int answer;
    private int lowEnd;
    private int highEnd;
    private List<Integer> guesses = new ArrayList<>();
    private final String WrongMsgStart = "Your Guess Was ";
     private final String WrongMsgEnd = ". Try Again!";
    private final String RightMsgStart = "Your Guess Of ";
    private final String RightMsgEnd = " Was Correct!";
    private Color msgColor= Color.MAGENTA;

    public Color getMsgColor() {
        return msgColor;
    }

    public void setMsgColor(Color msgColor) {
        this.msgColor = msgColor;
    }
    public NumberGuessResult() {
    }

    public List<Integer> getGuesses() {
        return guesses;
    }

    public void setGuesses(List<Integer> guesses) {
        this.guesses = guesses;
    }
    
    
    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getLowEnd() {
        return lowEnd;
    }

    public void setLowEnd(int lowEnd) {
        this.lowEnd = lowEnd;
    }

    public int getHighEnd() {
        return highEnd;
    }

    public void setHighEnd(int highEnd) {
        this.highEnd = highEnd;
    }
    
    public String compare(int guess){
        String result;
        if(guess<answer){
            this.msgColor= Color.MAGENTA;
            this.guesses.add(guess);
            result=this.WrongMsgStart+"Low"+this.WrongMsgEnd;
        }else if(guess>answer){
            this.msgColor= Color.MAGENTA;
            this.guesses.add(guess);
            result=this.WrongMsgStart+"High"+this.WrongMsgEnd;
        }else{
            this.msgColor= Color.GREEN;
            result=this.RightMsgStart+guess+this.RightMsgEnd;
        }
        return result;
    }
    public void generateAns(){
        Random r = new Random();
        int ans = r.nextInt(this.highEnd-this.lowEnd)+this.lowEnd;
        this.answer=ans;
        System.out.println("Shhh the answer is "+answer);
        
    }
    
}
