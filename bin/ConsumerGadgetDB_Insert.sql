INSERT INTO Techie(Techie_id,Techie_name,Techie_phone_no)
    VALUES
    (1,'MrWhosetheBoss','6780986781'),
    (2,'MKBHD','1234567890'),
    (3,'Dave2D','0987654321'),
    (4,'MaxTech','9876543210');

INSERT INTO Company(Company_name,Company_Desc,Company_DOE)
    VALUES
    ('Apple','American Tech giant','1976-04-01'),
    ('Samsung','South Korean Tech giant','1938-03-01'),
    ('Dell','American PC company','1984-02-01');

INSERT INTO Gadget(Gadget_serial_no,Gadget_name,Gadget_Company_name,Gadget_category)
    VALUES
    (1,'iPhone 15 Pro Max','Apple','Phone'),
    (2,'Galaxy S24 Ultra','Samsung','Phone'),
    (3,'Macbook M1 Pro 14 Inch','Apple','Laptop'),
    (4,'Dell XPS 17','Dell','laptop'),
    (5,'Apple Vision Pro','Apple','AR/VR Headset');

INSERT INTO Ownership(TG_link_id,T_id,G_id,DOP,Purchase_price)
    VALUES
    (1,1,2,'2024-01-12',1300),
    (2,2,1,'2023-09-24',1200),
    (3,3,4,'2022-04-17',1800),
    (4,4,3,'2023-06-19',2000),
    (5,2,2,'2024-01-10',1350),
    (6,1,5,'2024-03-04',4500),
    (7,2,5,'2024-02-24',4400),
    (8,3,5,'2024-03-14',4300),
    (9,4,5,'2024-03-24',4200);