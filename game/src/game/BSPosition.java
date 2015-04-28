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

enum Direction {};

public class BSPosition implements Position{ 
    Double2 dots=new Double2(0.0,0.0); 

    public double getDistance(BSPosition pos) throws Exception{
       double distance;
       distance=(this.dots.x-pos.dots.x)*(this.dots.x-pos.dots.x)+(this.dots.y-pos.dots.y)*(this.dots.y-pos.dots.y);
       return distance;
    }
    /*
        该函数返回两个Position的距离
        x.getDistance(y) == d(x, y)
        如果参数不合法应抛出异常
    */
    
    /**
     *
     * @param reletivePos
     * @return
     * @throws Exception
     */
    @Override
    public BSPosition getPosition(Double2 reletivePos) throws Exception{
      BSPosition absolutePos=new BSPosition();
      absolutePos.dots.x=this.dots.x+reletivePos.x;
      absolutePos.dots.y=this.dots.y+reletivePos.y;
      return absolutePos;
    }
    /*
        该函数返回在Position的相对位置的Position
    */
    
    public Double2 RelativePos(BSPosition absolutePos) throws Exception{
     Double2 reletivePos=new Double2(0.0,0.0);
     reletivePos.x=absolutePos.dots.x-this.dots.x;
     reletivePos.y=absolutePos.dots.y-this.dots.y;
     return reletivePos;
    }
    /*
        该函数返回两个Position的相对位置
        如果参数不合法应抛出异常
    */
    
    /*
        请补充其他对外接口
    */
    
    
}
}
