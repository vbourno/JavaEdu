package gr.aueb.cf.ch18.mobilecontacts.service;

import gr.aueb.cf.ch18.mobilecontacts.dto.MobileContactDTO;
import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.ContactNotFoundException;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.PhoneNumberAlreadyExistsException;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.UserIdAlreadyExistsException;

import java.awt.*;
import java.util.List;

public interface IMobileContactService {
    /**
     * Creates {@link MobileContact} based on the data carried by the {@link MobileContactDTO}.
     *
     * @param mobileContactDTO
     *                  the DTO object that contains the mobile contact data
     *
     * @return
     *                  the resulting {@link MobileContact}
     *
     * @throws PhoneNumberAlreadyExistsException
     *                  if the {@link MobileContact phoneNumber} already exists in the datasource
     *
     * @throws UserIdAlreadyExistsException
     *                  if the {@link MobileContact id} already exists in the datasource
     */
    MobileContact insertMobileContact(MobileContactDTO mobileContactDTO)
        throws PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException;

    //+ Docs
    MobileContact updateContact(MobileContactDTO mobileContactDTO)
        throws PhoneNumberAlreadyExistsException, ContactNotFoundException;

    //+ Docs
    void deleteContact(String phoneNumber) throws ContactNotFoundException;

    //+ Docs
    MobileContact getContact(String phoneNumber) throws ContactNotFoundException;

    //+ Docs
    MobileContact getContact(Long id) throws ContactNotFoundException;

    //+ Docs
    List<MobileContact> getAllContacts();
}
