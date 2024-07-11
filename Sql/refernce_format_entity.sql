create table if not exists refernce_format_entity(
refernce_format_key Integer not null,
record_key Integer null,
effective_date varchar(255) null,
payment_mode Integer null,
instanct_reference_code varchar(255) null,
transfer_model varchar(255) null,
payment_from varchar(255) null,
legal_type varchar(255) null,
entity_state varchar(255) null,
modified_date varchar(255) null,
remarks varchar(255) null,
constraint refernce_format_entity_pk primary key(refernce_format_key));