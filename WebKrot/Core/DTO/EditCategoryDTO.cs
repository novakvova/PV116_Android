﻿namespace Core.DTO
{
    public class EditCategoryDTO
    {
        public int Id { get; set; }
        public required string Name { get; set; }
        public string? Description { get; set; }
        public string? ImagePath { get; set; }
    }
}
