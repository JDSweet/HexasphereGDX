package com.origin.hexasphere.geometry;

import com.origin.hexasphere.HexaGame;

public class Face
{
    private Hexasphere hexasphere;
    private int index1, index2, index3;

    public Face(Hexasphere hexasphere, int idx1, int idx2, int idx3, boolean trackFaceInPoints)
    {
        this.index1 = idx1;
        this.index2 = idx2;
        this.index3 = idx3;
    }

    public Point getPoint1()
    {
        return hexasphere.getPointAt(index1);
    }

    public Point getPoint2()
    {
        return hexasphere.getPointAt(index2);
    }

    public Point getPoint3()
    {
        return hexasphere.getPointAt(index3);
    }

    public short getIdx1()
    {
        return (short)index1;
    }

    public short getIdx2()
    {
        return (short)index2;
    }

    public short getIdx3()
    {
        return (short)index3;
    }
}
