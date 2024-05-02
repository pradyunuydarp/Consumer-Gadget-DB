create DATABASE ConsumerGadgetDB;
use ConsumerGadgetDB;

create TABLE Techie(
    Techie_id INT,
    Techie_name VARCHAR(20),
    Techie_phone_no CHAR(10),
    CONSTRAINT pk_Techie PRIMARY KEY (Techie_id)
);

create TABLE Gadget(
    Gadget_serial_no INT,
    Gadget_name VARCHAR(25),
    Gadget_Company_name VARCHAR(20),
    Gadget_category VARCHAR(20),
    CONSTRAINT pk_Gadget PRIMARY KEY (Gadget_serial_no)
);

create TABLE Company(
    Company_name VARCHAR(20),
    Company_DOE Date NOT NULL,
    Company_Desc VARCHAR(100),
    CONSTRAINT pk_Company PRIMARY KEY (Company_name)
);

create TABLE Ownership(
    TG_link_id INT,
    T_id INT,
    G_id INT,
    DOP DATE NOT NULL,
    Purchase_price INT,
    CONSTRAINT pk_Ownership PRIMARY KEY (TG_link_id)
);