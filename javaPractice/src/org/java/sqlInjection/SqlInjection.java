package org.java.sqlInjection;

import java.util.HashSet;
import java.util.Set;

public class SqlInjection {

   private static Set<String> sqlKeyWords=new HashSet<String>();
   
      static {
    	  sqlKeyWords.add("INSERT");
    	   sqlKeyWords.add("UPDATE");
    	   sqlKeyWords.add("DELETE");
    	   sqlKeyWords.add("TRUNCATE");
    	   sqlKeyWords.add("DROP");
    	   sqlKeyWords.add("EXECUTE");
    	   sqlKeyWords.add("ALTER");
    	   sqlKeyWords.add("ALLOCATE");
    	   sqlKeyWords.add("AUDIT");
    	   sqlKeyWords.add("BEGIN");
    	   sqlKeyWords.add("COMMIT");
    	   sqlKeyWords.add("ROLLBACK");
    	   sqlKeyWords.add("CURSOR");
    	   sqlKeyWords.add("DB2");
    	   sqlKeyWords.add("CONNECT");
    	   sqlKeyWords.add("DYNAMIC");
    	   sqlKeyWords.add("ESCAPE");
    	   sqlKeyWords.add("EXCEPTION");
    	   sqlKeyWords.add("FOREIGN");
    	   sqlKeyWords.add("IMMEDIATE");
    	   sqlKeyWords.add("REVOKE");
    	   sqlKeyWords.add("GRANT");
    	   sqlKeyWords.add("ROLE");
    	   sqlKeyWords.add("SEQUENCE");
    	   sqlKeyWords.add("SELECT");
      }
      
        public static Boolean isItDangerous(String input) {
        	for(String keyword:sqlKeyWords) {
        		 if(org.apache.commons.lang3.StringUtils.containsIgnoreCase(input, keyword)) {
        			 return true;
        		 }
        	}
			return false;
        }
        
        public static boolean isItDangerousFullString(String input) {
        	if(input!=null && sqlKeyWords.contains(input.toUpperCase())) {
        		return true;
        	}
			return false;
        }
      
}
