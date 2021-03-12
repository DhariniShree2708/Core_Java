package com.hcl.training.enums;

public class EnumDemo
{
 public static void main(String args[]){
	Direction dir = Direction.NORTH;  
	if(dir == Direction.EAST) {
	    System.out.println("Direction: East");
	} else if(dir == Direction.WEST) {
	    System.out.println("Direction: West");
	  } else if(dir == Direction.NORTH) {
	      System.out.println("Direction: North");
	    } else {
		System.out.println("Direction: South");
	      }
 }
}