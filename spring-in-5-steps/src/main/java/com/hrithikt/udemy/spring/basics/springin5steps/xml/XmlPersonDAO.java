package com.hrithikt.udemy.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class XmlPersonDAO {
	XmlJdbcConnection jdbcConnection;

	public XmlJdbcConnection getXmlJdbcConnection() {
		return jdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
