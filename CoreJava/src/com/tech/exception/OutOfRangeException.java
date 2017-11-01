// User Defined exception
package com.tech.exception;

class OutOfRangeException extends Exception
{
	public OutOfRangeException()
	{
		super();
	}
	public OutOfRangeException(String msg)
	{
		super(msg);
	}	
}