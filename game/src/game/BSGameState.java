/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;

/**
 *
 * @author huangzhen
 */
public class BSGameState implements GameState<BSShip, BSPosition>{
     public String DescribeGameState(){
         
     }
   
    
    ArrayList<Ship> getShips();
    /*
        返回装有所有的船的引用的数组
    */
    
    double getShipCondition(Ship ship) throws Exception;
    /*
        返回某船剩余血条
        参数不合法需抛出异常
    */
    
    Position getShipPosition(Ship ship) throws Exception;
    /*
        返回某船位置
        参数不合法需抛出异常
    */
}
