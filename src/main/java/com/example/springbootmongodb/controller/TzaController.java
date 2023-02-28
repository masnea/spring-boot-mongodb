package com.example.springbootmongodb.controller;


import com.example.springbootmongodb.model.Application;

import com.example.springbootmongodb.model.Release;
import com.example.springbootmongodb.model.Ticket;
import com.example.springbootmongodb.repositories.ApplicationRepository;
import com.example.springbootmongodb.repositories.ReleaseRepository;
import com.example.springbootmongodb.repositories.TicketRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tza")
public class TzaController {
    private final ApplicationRepository applicationRepository;

    private final ReleaseRepository releaseRepository;

    private final TicketRepository ticketRepository;

    public TzaController(ApplicationRepository applicationRepository, ReleaseRepository releaseRepository, TicketRepository ticketRepository) {
        this.applicationRepository = applicationRepository;
        this.releaseRepository = releaseRepository;
        this.ticketRepository = ticketRepository;
    }

    // ************** Methods for Applications *************************
    @RequestMapping(value = "/applications", method = RequestMethod.GET)
    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    @RequestMapping(value = "/applications/{id}", method = RequestMethod.GET)
    public Optional<Application> getApplicationById(@PathVariable("id") String id) {
        return applicationRepository.findById(id);
    }

    @RequestMapping(value = "/applications", method = RequestMethod.POST)
    public Application addNewApplication(@RequestBody Application application){
        return applicationRepository.save(application);
    }

    @RequestMapping(value = "/applications/{id}", method = RequestMethod.PUT)
    public Application updateApplication(@PathVariable("id") String id, @RequestBody Application application){
        application.setId(id);
        return applicationRepository.save(application);
    }

    @RequestMapping(value = "/applications/{id}", method = RequestMethod.DELETE)
    public void deleteApplication(@PathVariable("id") String id) {
        applicationRepository.deleteById(id);
    }

    // ************** Methods for Tickets *************************
    @RequestMapping(value = "/tickets", method = RequestMethod.GET)
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @RequestMapping(value = "/tickets/{id}", method = RequestMethod.GET)
    public Optional<Ticket> getTicketById(@PathVariable("id") String id) {
        return ticketRepository.findById(id);
    }

    @RequestMapping(value = "/tickets", method = RequestMethod.POST)
    public Ticket addNewApplication(@RequestBody Ticket ticket){
        return ticketRepository.save(ticket);
    }

    @RequestMapping(value = "/tickets/{id}", method = RequestMethod.PUT)
    public Ticket updateApplication(@PathVariable("id") String id, @RequestBody Ticket ticket){
        ticket.setId(id);
        return ticketRepository.save(ticket);
    }

    @RequestMapping(value = "/tickets/{id}", method = RequestMethod.DELETE)
    public void deleteTicket(@PathVariable("id") String id) {
        ticketRepository.deleteById(id);
    }

    // ************** Methods for Releases *************************
    @RequestMapping(value = "/releases", method = RequestMethod.GET)
    public List<Release> getAllReleases() {
        return releaseRepository.findAll();
    }

    @RequestMapping(value = "/releases/{id}", method = RequestMethod.GET)
    public Optional<Release> getReleaseId(@PathVariable("id") String id) {
        return releaseRepository.findById(id);
    }

    @RequestMapping(value = "/releases", method = RequestMethod.POST)
    public Release addNewRelease(@RequestBody Release release){
        return releaseRepository.save(release);
    }

    @RequestMapping(value = "/releases/{id}", method = RequestMethod.PUT)
    public Release updateRelease(@PathVariable("id") String id, @RequestBody Release release){
        release.setId(id);
        return releaseRepository.save(release);
    }

    @RequestMapping(value = "/releases/{id}", method = RequestMethod.DELETE)
    public void deleteRelease(@PathVariable("id") String id) {
        releaseRepository.deleteById(id);
    }

}
