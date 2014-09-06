package com.fire.flamecore.utils.geometry;

public class Cube 
{
	
	Point a;
	Point b;
	
	public Cube(Point a, Point b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int volume() 
	{
		return Math.abs(a.x - b.x) * Math.abs(a.y - b.y) * Math.abs(a.z - b.z);
	}
	
	public boolean overlaps(Cube cube)
	{
		if (minZ() >= cube.maxZ() || maxZ() <= cube.minZ())
			return false;
		if (minX() >= cube.maxX() || maxX() <= cube.minX())
			return false;
		if (minY() >= cube.maxY() || maxY() <= cube.minY())
			return false;
		return true;
	}
	
	public int maxZ()
	{
		return a.z >= b.z ? a.z : b.z;
	}
	
	public int minZ()
	{
		return a.z >= b.z ? b.z : a.z;
	}
	
	public int maxX()
	{
		return a.x >= b.x ? a.x : b.x;
	}
	
	public int minX()
	{
		return a.x >= b.x ? b.x : a.x;
	}
	
	public int maxY() 
	{
		return a.y >= b.y ? a.y : b.y;
	}
	
	public int minY() 
	{
		return a.y >= b.y ? b.y : a.y;
	}

}
