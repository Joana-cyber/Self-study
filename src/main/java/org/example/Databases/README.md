# Database Modelling and Management

## Benefits of relational database
- Categorizing data 
- Accuracy (eliminates data duplication)
- Ease of use.
- collaboration.
- security.

## When to use relational database
Relational databases are ideal for complex data analysis and operations. 
In a non-relational database, tables can share the same data but they can't 'relate' to 
each other. With a relational database, they can. One use of a relational database is 
connecting tables for customer data and transactions.

## Logical database design process
1. Identify goals of database and related systems/processes.
2. Find and organize information required.
3. Identify entities.
4. Identify attributes.
5. Identify keys
6. Identify relationships
7. Normalize.
8. Review and iterate. 

## Normalization
1. *1NF:* Each cell should contain only one value.
2. *2NF:*
   - Every non-key column must functionally depend on entire primary key.
   - must also be in 1NF
3. *3NF:*
   - No non-key column may depend on another non-key column.
   - must also be in 2NF.
          