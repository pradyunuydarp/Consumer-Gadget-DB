ALTER TABLE Gadget
    add CONSTRAINT fk_Gadget_to_Brand FOREIGN KEY (Gadget_Company_name) REFERENCES Company(Company_name)
    on delete CASCADE;

alter table Ownership
    add CONSTRAINT fk_Ownership_to_techie FOREIGN KEY (T_id) REFERENCES Techie(Techie_id)
    on delete CASCADE;

alter table Ownership
    add constraint fk_Ownership_to_gadget FOREIGN KEY (G_id) REFERENCES Gadget(Gadget_serial_no)
    on delete CASCADE;