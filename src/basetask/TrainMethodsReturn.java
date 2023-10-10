package basetask;

public class TrainMethodsReturn {

    public int returnNewInt(int x){

        return(x*3);
    }

    public long returnNewLong(long y){

        return(y-4);
    }

    public String returnNewChar(char z){

        String str1 = z + " ";

        return str1 + z;
    }

    public float returnNewFloat(float v){

        return(v/2);
    }

    public double returnNewDouble(double n){

        return(n + 8);
    }

    public short returnNewShort(short u){

        return (short) (u - 1);
    }

    public byte returnNewByte(byte i){

        return (byte) (i*2);
    }

    public boolean returnNewBoolean(boolean p){

        return ! p;
    }
}
