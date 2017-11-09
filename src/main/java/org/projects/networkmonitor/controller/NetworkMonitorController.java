package org.projects.networkmonitor.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class NetworkMonitorController { 
  /*------- Class variables -------*/
  /*------- Start of Code -------*/
  
  @RequestMapping(value="/ping", method = RequestMethod.GET)
  String ping() { 
    /*------- Local variables -------*/
    /*------- Start of Code -------*/
    
    return("I'm Alive") ;
  } /* END OF method ping */

} /* END OF class NetworkMonitorController */

/* END OF source file */
