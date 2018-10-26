package com.trx.liang.service;

public class Snippet {
	<properties>  
	        <!-- spring�汾�� -->  
	        <spring.version>4.0.2.RELEASE</spring.version>  
	        <!-- mybatis�汾�� -->  
	        <mybatis.version>3.2.6</mybatis.version>  
	        <!-- log4j��־�ļ��������汾 -->  
	        <slf4j.version>1.7.7</slf4j.version>  
	        <log4j.version>1.2.17</log4j.version>  
	    </properties> 
	    
	    <dependencies>
	        <dependency>
	            <groupId>junit</groupId>
	            <artifactId>junit</artifactId>
	            <version>3.8.1</version>
	             <!-- ��ʾ������ʱ�����룬������ʱ�򲻻���ش˰� -->  
	            <scope>test</scope>
	        </dependency>
	        <!-- <dependency>
	            <groupId>javax.servlet</groupId>
	            <artifactId>javax.servlet-api</artifactId>
	            <version>3.1.0</version>
	        </dependency> -->
	        
	         <!-- spring���İ� -->  
	        <dependency>  
	            <groupId>org.springframework</groupId>  
	            <artifactId>spring-core</artifactId>  
	            <version>${spring.version}</version>  
	        </dependency>  
	  
	        <dependency>  
	            <groupId>org.springframework</groupId>  
	            <artifactId>spring-web</artifactId>  
	            <version>${spring.version}</version>  
	        </dependency>  
	        <dependency>  
	            <groupId>org.springframework</groupId>  
	            <artifactId>spring-oxm</artifactId>  
	            <version>${spring.version}</version>  
	        </dependency>  
	        <dependency>  
	            <groupId>org.springframework</groupId>  
	            <artifactId>spring-tx</artifactId>  
	            <version>${spring.version}</version>  
	        </dependency>  
	  
	        <dependency>  
	            <groupId>org.springframework</groupId>  
	            <artifactId>spring-jdbc</artifactId>  
	            <version>${spring.version}</version>  
	        </dependency>  
	  
	        <dependency>  
	            <groupId>org.springframework</groupId>  
	            <artifactId>spring-webmvc</artifactId>  
	            <version>${spring.version}</version>  
	        </dependency>  
	        <dependency>  
	            <groupId>org.springframework</groupId>  
	            <artifactId>spring-aop</artifactId>  
	            <version>${spring.version}</version>  
	        </dependency>  
	  
	        <dependency>  
	            <groupId>org.springframework</groupId>  
	            <artifactId>spring-context-support</artifactId>  
	            <version>${spring.version}</version>  
	        </dependency>  
	  
	        <dependency>  
	            <groupId>org.springframework</groupId>  
	            <artifactId>spring-test</artifactId>  
	            <version>${spring.version}</version>  
	        </dependency>  
	        <!-- mybatis���İ� -->  
	        <dependency>  
	            <groupId>org.mybatis</groupId>  
	            <artifactId>mybatis</artifactId>  
	            <version>${mybatis.version}</version>  
	        </dependency>  
	         <!-- mybatis/spring�� -->  
	        <dependency>  
	            <groupId>org.mybatis</groupId>  
	            <artifactId>mybatis-spring</artifactId>  
	            <version>1.2.2</version>  
	        </dependency>  
	        
	         <!-- ����java ee jar �� -->  
	        <dependency>  
	            <groupId>javax</groupId>  
	            <artifactId>javaee-api</artifactId>  
	            <version>7.0</version>  
	        </dependency>  
	        
	         <!-- ����Mysql���ݿ�����jar�� -->  
	        <dependency>  
	            <groupId>mysql</groupId>  
	            <artifactId>mysql-connector-java</artifactId>  
	            <version>5.1.36</version>  
	        </dependency>  
	        <!-- ����dbcp��jar����������applicationContext.xml���������ݿ� -->  
	        <dependency>  
	            <groupId>commons-dbcp</groupId>  
	            <artifactId>commons-dbcp</artifactId>  
	            <version>1.2.2</version>  
	        </dependency>  
	        
	        <!-- JSTL��ǩ�� -->  
	        <dependency>  
	            <groupId>jstl</groupId>  
	            <artifactId>jstl</artifactId>  
	            <version>1.2</version>  
	        </dependency>  
	        <!-- ��־�ļ������� -->  
	        <!-- log start -->  
	        <dependency>  
	            <groupId>log4j</groupId>  
	            <artifactId>log4j</artifactId>  
	            <version>${log4j.version}</version>  
	        </dependency>  
	          
	          
	        <!-- ��ʽ�����󣬷��������־ -->  
	        <dependency>  
	            <groupId>com.alibaba</groupId>  
	            <artifactId>fastjson</artifactId>  
	            <version>1.1.41</version>  
	        </dependency>  
	  
	  
	        <dependency>  
	            <groupId>org.slf4j</groupId>  
	            <artifactId>slf4j-api</artifactId>  
	            <version>${slf4j.version}</version>  
	        </dependency>  
	  
	        <dependency>  
	            <groupId>org.slf4j</groupId>  
	            <artifactId>slf4j-log4j12</artifactId>  
	            <version>${slf4j.version}</version>  
	        </dependency>  
	        <!-- log end -->  
	        <!-- ӳ��JSON -->  
	        <dependency>  
	            <groupId>org.codehaus.jackson</groupId>  
	            <artifactId>jackson-mapper-asl</artifactId>  
	            <version>1.9.13</version>  
	        </dependency>  
	        <!-- �ϴ������ -->  
	        <dependency>  
	            <groupId>commons-fileupload</groupId>  
	            <artifactId>commons-fileupload</artifactId>  
	            <version>1.3.1</version>  
	        </dependency>  
	        <dependency>  
	            <groupId>commons-io</groupId>  
	            <artifactId>commons-io</artifactId>  
	            <version>2.4</version>  
	        </dependency>  
	        <dependency>  
	            <groupId>commons-codec</groupId>  
	            <artifactId>commons-codec</artifactId>  
	            <version>1.9</version>  
	        </dependency>  
	
	    </dependencies>
	    
	    <build>
	        <finalName>maven01</finalName>
	        <plugins>
	            <plugin>
	                <groupId>org.eclipse.jetty</groupId>
	                <artifactId>jetty-maven-plugin</artifactId>
	                <version>9.2.8.v20150217</version>
	                <configuration>
	                    <httpConnector>
	                        <port>80</port>
	                    </httpConnector>
	                    <stopKey>shutdown</stopKey>
	                    <stopPort>9966</stopPort>
	                </configuration>
	            </plugin>
	        </plugins>
	    </build>
}
