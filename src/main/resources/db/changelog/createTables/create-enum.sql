DO language plpgsql $$
BEGIN
	RAISE NOTICE 'Creating enum';
  IF NOT EXISTS (SELECT 1 FROM pg_type WHERE typname = 'possible_mark') THEN
        create type possible_mark AS ENUM ('insufficient', 'sufficient', 'good', 'perfect');
END IF;
END
$$;