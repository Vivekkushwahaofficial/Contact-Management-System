package crm.model;

import java.util.Collection;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactsController {

    private final ContactRepository repository;

    public ContactsController(ContactRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/contacts")
    public Collection<Contact> getContacts() {
        return (Collection<Contact>) repository.findAll();
    }

    @PostMapping("/contacts")
    public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
        Contact result = repository.save(contact);
        return ResponseEntity.ok(result);
    }
}