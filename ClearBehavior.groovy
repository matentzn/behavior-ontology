def b = new File(args[0]).getText()

b = b.replaceAll("property_value: created:by","created_by:")
b = b.replaceAll("property_value: creation:date", "creation_date:")
b = b.replaceAll("property_value: http://purl.obolibrary.org/obo/namespace","namespace:")
b = b.replaceAll("property_value: http://purl.obolibrary.org/obo/synonym","synonym:")
b = b.replaceAll("property_value: http://purl.obolibrary.org/obo/comment","comment:")
b = b.replaceAll("property_value: alt:id","alt_id:")
b = b.replaceAll("property_value: \"note\"","!property_value: \"note\"")
b = b.replaceAll("property_value: is:obsolete \"true\"","is_obsolete: true")
b = b.replaceAll("property_value: http://purl.obolibrary.org/obo/xref","xref:")
b = b.replaceAll("property_value: http://purl.obolibrary.org/obo/def","def:")
b = b.replaceAll("xsd:string","[]")
b = b.replaceAll("\\\\\"","")

println b
