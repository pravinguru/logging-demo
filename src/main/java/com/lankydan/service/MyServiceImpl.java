package com.lankydan.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

  private static final Logger LOGGER = LoggerFactory.getLogger(MyServiceImpl.class);

  @Override
  public void doStuff(final String value) {
    LOGGER.trace("I am here for Tracing - {}", value);
    LOGGER.debug("I am here for debugging - {}", value);
    LOGGER.info("I am here for Info - {}", value);
    LOGGER.warn("I am here for warning - {}", value);
    LOGGER.error("I am here for error  - {}", value);
  }
}
