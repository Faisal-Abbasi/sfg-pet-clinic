package com.examples.sfgpetclinic.services;

import com.examples.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>
{
    Owner findByLastName(String name);

}
