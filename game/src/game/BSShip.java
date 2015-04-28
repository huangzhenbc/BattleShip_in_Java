/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author huangzhen
 */
public class BSShip implements Ship{
    int shipsize;
   public BSShip(int s){
       this.shipsize=s;
   }
   public BSShip(){
       this.shipsize=0;
   }
    public int getshipsize(int size){
        this.shipsize=size;
        return shipsize;
    }
    public BSPosition shipposition(int size, BSPosition mouse){
        
    }
}
