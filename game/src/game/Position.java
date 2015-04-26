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
interface Position {
    abstract double getDistance(Position pos) throws Exception;
    /*
        该函数返回两个Position的距离
        x.getDistance(y) == d(x, y)
        如果参数不合法应抛出异常
    */
    
    Position getPosition(Double2 reletivePos) throws Exception;
    /*
        该函数返回在Position的相对位置的Position
    */
    
    abstract Double2 RelativePos(Position absolutePos) throws Exception;
    /*
        该函数返回两个Position的相对位置
        如果参数不合法应抛出异常
    */
    
    /*
        请补充其他对外接口
    */
    
    
}
