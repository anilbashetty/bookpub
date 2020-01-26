package com.example.bookpub.main;

import com.example.bookpub.repository.BookRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author anilb
 */
public class StartupRunner implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private BookRepository bookRepository;

    @Scheduled(initialDelay = 1000, fixedRate = 10000)
    public void run(String... args) throws Exception {
        logger.info("Before");
        logger.info("Number of books: " +bookRepository.count());
        logger.info("After");
    }
}
