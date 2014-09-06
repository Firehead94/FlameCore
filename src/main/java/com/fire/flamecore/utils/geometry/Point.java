package com.fire.flamecore.utils.geometry;

public class Point 
{
	
	int x;
	int y;
	int z;
	
	public Point(int x, int y, int z) 
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public boolean equals(Point point) 
	{
		if (point.x == this.x && point.y == this.y && point.z == this.z)
			return true;
		return false;
	}
	
	public double distanceTo(Point point) 
	{
		return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2) + Math.pow(point.z - this.z, 2));
	}
	
	public String toString() 
	{
		return String.format("X: %i, Y: %i, Z: %i", this.x, this.y, this.z);
	}

}
