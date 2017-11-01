package com.tech.collection;

import java.util.*;
class JobComparator implements Comparator
{
	
    @Override
    public int compare(Object o1, Object o2) {
                Emp2 e1=(Emp2)o1;
		Emp2 e2=(Emp2)o2;
		return e1.job.compareTo(e2.job); }

    
}